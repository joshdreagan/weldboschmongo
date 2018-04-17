# Weld Bosch Camel Processor

To build this project use

```
$ mvn install
```

To run the project you can execute the following Maven goal

```
$ mvn spring-boot:run
```

To install the project on OpenShift

```
$ oc new-project weldbosch #Only if you haven't already created the project
$ 
$ oc create -f src/main/kube/configmap.yml
$ oc create -f src/main/kube/secret.yml
$ oc create -f src/main/kube/serviceaccount.yml
$ oc secrets add sa/weldboschmongo-sa secret/weldboschmongo-secret
$ oc policy add-role-to-user view system:serviceaccount:weldbosch:weldboschmongo-sa
$ mvn clean install fabric8:resource fabric8:build fabric8:deploy
```

Notes

For MongoDB

```
$ oc rsh <mongo_pod>
$ mongo -u admin -p admin admin
> db.grantRolesToUser("mongouser", "roles": [ { "role": "readWrite", "db": "weld2" } ])
```    