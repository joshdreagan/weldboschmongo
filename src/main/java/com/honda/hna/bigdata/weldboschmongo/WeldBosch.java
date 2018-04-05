package com.honda.hna.bigdata.weldboschmongo;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class WeldBosch {
	Long protRecord_ID;
	Date dateTime;
	String timerName;
	Long progNo;
	String spotName;
	Long wear; 
	Double wearPerCent;
	Long monitorState;
	String monitorState_txt;
	Long regulationState;
	String regulationState_txt;
	Long measureState;
	String measureState_txt;
	Long powerState;
	String powerState_txt;
	Long sequenceState;
	String sequenceState_txt;
	Long sequenceStateAdd;
	String sequenceStateAdd_txt;
	Long sequenceRepeat;
	String sequenceRepeat_txt;
	Long monitorMode;
	String monitorMode_txt;
	Double iDemandStd;
	Double ilsts;
	Long regulationStd;
	String regulationStd_txt;
	Double iDemand1;
	Double iActual1;
	Long regulation1;
	String regulation1_txt;
	Double iDemand2;
	Double iActual2;
	Long regulation2;
	String regulation2_txt;
	Double iDemand3;
	Double iActual3;
	Long regulation3;
	String regulation3_txt;
	Double phaStd;
	Double pha1;
	Double pha2;
	Double pha3;
	Long t_iDemandStd;
	Long tActualStd;
	String partIdentString;
	Long tipDressCounter;
	Long electrodeNo;
	Double voltageActualValue;
	Double voltageRefValue;
	Double currentActualValue;
	Double currentReferenceValue;
	Double weldTimeActualValue;
	Double weldTimeRefValue;
	Double energyActualValue;
	Double energyRefValue;
	Double powerActualValue;
	Double powerRefValue;
	Double resistanceActualValue;
	Double resistanceRefValue;
	Double pulseWidthActualValue;
	Double pulseWidthRefValue;
	Double stabilisationFactorActValue;
	Double stabilisationFactorRefValue;
	Double thresholdStabilisationFactor;
	Double wldEffectStabilisationFactor;
	Double uipActualValue;
	Double uipRefValue;
	Long uirExpulsionTime;
	Long uirMeasuringActive;
	String uirMeasuringActive_txt;
	Long uirRegulationActive;
	String uirRegulationActive_txt;
	Long uirMonitoringActive;
	String uirMonitoringActive_txt;
	Long uirWeldTimeProlongationActive;
	String uirWeldTimeProlongActive_txt;
	Long uirQStoppRefCntValue;
	Long uirQStoppActCntValue;
	Long uirUipUpperTol;
	Long uirUipLowerTol;
	Long uirUipCondTol;
	Long uirPsfLowerTol;
	Long uirPsfCondTol;


	public WeldBosch() {
		super();
	}

	public WeldBosch(String timerNameIn, long messageIndex) {
		protRecord_ID=messageIndex;
		timerName=timerNameIn;
	}

	public Long getProtRecord_ID() {
		return protRecord_ID;
	}

	@JsonSerialize(using = BsonDateSerializer.class) 
	public Date getDateTime() {
		return dateTime;
	}

	public String getTimerName() {
		return timerName;
	}
	
	public Long getProgNo() {
		return progNo;
	}
	
	public String getSpotName() {
		return spotName;
	}
	
	public Long getWear() {
		return wear;
	}

	public Double getWearPerCent() {
		return wearPerCent;
	}

	public Long getMonitorState() {
		return monitorState;
	}

	public String getMonitorState_txt() {
		return monitorState_txt;
	}

	public Long getRegulationState() {
		return regulationState;
	}

	public String getRegulationState_txt() {
		return regulationState_txt;
	}

	public Long getMeasureState() {
		return measureState;
	}

	public String getMeasureState_txt() {
		return measureState_txt;
	}

	public Long getPowerState() {
		return powerState;
	}

	public String getPowerState_txt() {
		return powerState_txt;
	}

	public Long getSequenceState() {
		return sequenceState;
	}

	public String getSequenceState_txt() {
		return sequenceState_txt;
	}

	public Long getSequenceStateAdd() {
		return sequenceStateAdd;
	}

	public String getSequenceStateAdd_txt() {
		return sequenceStateAdd_txt;
	}

	public Long getSequenceRepeat() {
		return sequenceRepeat;
	}

	public String getSequenceRepeat_txt() {
		return sequenceRepeat_txt;
	}

	public Long getMonitorMode() {
		return monitorMode;
	}

	public String getMonitorMode_txt() {
		return monitorMode_txt;
	}

	public Double getiDemandStd() {
		return iDemandStd;
	}

	public Double getIlsts() {
		return ilsts;
	}

	public Long getRegulationStd() {
		return regulationStd;
	}

	public String getRegulationStd_txt() {
		return regulationStd_txt;
	}

	public Double getiDemand1() {
		return iDemand1;
	}

	public Double getiActual1() {
		return iActual1;
	}

	public Long getRegulation1() {
		return regulation1;
	}

	public String getRegulation1_txt() {
		return regulation1_txt;
	}

	public Double getiDemand2() {
		return iDemand2;
	}

	public Double getiActual2() {
		return iActual2;
	}

	public Long getRegulation2() {
		return regulation2;
	}

	public String getRegulation2_txt() {
		return regulation2_txt;
	}

	public Double getiDemand3() {
		return iDemand3;
	}

	public Double getiActual3() {
		return iActual3;
	}

	public Long getRegulation3() {
		return regulation3;
	}

	public String getRegulation3_txt() {
		return regulation3_txt;
	}

	public Double getPhaStd() {
		return phaStd;
	}

	public Double getPha1() {
		return pha1;
	}

	public Double getPha2() {
		return pha2;
	}

	public Double getPha3() {
		return pha3;
	}

	public Long getT_iDemandStd() {
		return t_iDemandStd;
	}

	public Long gettActualStd() {
		return tActualStd;
	}

	public String getPartIdentString() {
		return partIdentString;
	}

	public Long getTipDressCounter() {
		return tipDressCounter;
	}

	public Long getElectrodeNo() {
		return electrodeNo;
	}

	public Double getVoltageActualValue() {
		return voltageActualValue;
	}

	public Double getVoltageRefValue() {
		return voltageRefValue;
	}

	public Double getCurrentActualValue() {
		return currentActualValue;
	}

	public Double getCurrentReferenceValue() {
		return currentReferenceValue;
	}

	public Double getWeldTimeActualValue() {
		return weldTimeActualValue;
	}

	public Double getWeldTimeRefValue() {
		return weldTimeRefValue;
	}

	public Double getEnergyActualValue() {
		return energyActualValue;
	}

	public Double getEnergyRefValue() {
		return energyRefValue;
	}

	public Double getPowerActualValue() {
		return powerActualValue;
	}

	public Double getPowerRefValue() {
		return powerRefValue;
	}

	public Double getResistanceActualValue() {
		return resistanceActualValue;
	}

	public Double getResistanceRefValue() {
		return resistanceRefValue;
	}

	public Double getPulseWidthActualValue() {
		return pulseWidthActualValue;
	}

	public Double getPulseWidthRefValue() {
		return pulseWidthRefValue;
	}

	public Double getStabilisationFactorActValue() {
		return stabilisationFactorActValue;
	}

	public Double getStabilisationFactorRefValue() {
		return stabilisationFactorRefValue;
	}

	public Double getThresholdStabilisationFactor() {
		return thresholdStabilisationFactor;
	}

	public Double getWldEffectStabilisationFactor() {
		return wldEffectStabilisationFactor;
	}

	public Double getUipActualValue() {
		return uipActualValue;
	}

	public Double getUipRefValue() {
		return uipRefValue;
	}

	public Long getUirExpulsionTime() {
		return uirExpulsionTime;
	}

	public Long getUirMeasuringActive() {
		return uirMeasuringActive;
	}

	public String getUirMeasuringActive_txt() {
		return uirMeasuringActive_txt;
	}

	public Long getUirRegulationActive() {
		return uirRegulationActive;
	}

	public String getUirRegulationActive_txt() {
		return uirRegulationActive_txt;
	}

	public Long getUirMonitoringActive() {
		return uirMonitoringActive;
	}

	public String getUirMonitoringActive_txt() {
		return uirMonitoringActive_txt;
	}

	public Long getUirWeldTimeProlongationActive() {
		return uirWeldTimeProlongationActive;
	}

	public String getUirWeldTimeProlongActive_txt() {
		return uirWeldTimeProlongActive_txt;
	}

	public Long getUirQStoppRefCntValue() {
		return uirQStoppRefCntValue;
	}

	public Long getUirQStoppActCntValue() {
		return uirQStoppActCntValue;
	}

	public Long getUirUipUpperTol() {
		return uirUipUpperTol;
	}

	public Long getUirUipLowerTol() {
		return uirUipLowerTol;
	}

	public Long getUirUipCondTol() {
		return uirUipCondTol;
	}

	public Long getUirPsfLowerTol() {
		return uirPsfLowerTol;
	}

	public Long getUirPsfCondTol() {
		return uirPsfCondTol;
	}

	public void setProtRecord_ID(Long protRecord_ID) {
		this.protRecord_ID = protRecord_ID;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public void setTimerName(String timerName) {
		this.timerName = timerName;
	}

	public void setProgNo(Long progNo) {
		this.progNo = progNo;
	}

	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}

	public void setWear(Long wear) {
		this.wear = wear;
	}

	public void setWearPerCent(Double wearPerCent) {
		this.wearPerCent = wearPerCent;
	}

	public void setMonitorState(Long monitorState) {
		this.monitorState = monitorState;
	}

	public void setMonitorState_txt(String monitorState_txt) {
		this.monitorState_txt = monitorState_txt;
	}

	public void setRegulationState(Long regulationState) {
		this.regulationState = regulationState;
	}

	public void setRegulationState_txt(String regulationState_txt) {
		this.regulationState_txt = regulationState_txt;
	}

	public void setMeasureState(Long measureState) {
		this.measureState = measureState;
	}

	public void setMeasureState_txt(String measureState_txt) {
		this.measureState_txt = measureState_txt;
	}

	public void setPowerState(Long powerState) {
		this.powerState = powerState;
	}

	public void setPowerState_txt(String powerState_txt) {
		this.powerState_txt = powerState_txt;
	}

	public void setSequenceState(Long sequenceState) {
		this.sequenceState = sequenceState;
	}

	public void setSequenceState_txt(String sequenceState_txt) {
		this.sequenceState_txt = sequenceState_txt;
	}

	public void setSequenceStateAdd(Long sequenceStateAdd) {
		this.sequenceStateAdd = sequenceStateAdd;
	}

	public void setSequenceStateAdd_txt(String sequenceStateAdd_txt) {
		this.sequenceStateAdd_txt = sequenceStateAdd_txt;
	}

	public void setSequenceRepeat(Long sequenceRepeat) {
		this.sequenceRepeat = sequenceRepeat;
	}

	public void setSequenceRepeat_txt(String sequenceRepeat_txt) {
		this.sequenceRepeat_txt = sequenceRepeat_txt;
	}

	public void setMonitorMode(Long monitorMode) {
		this.monitorMode = monitorMode;
	}

	public void setMonitorMode_txt(String monitorMode_txt) {
		this.monitorMode_txt = monitorMode_txt;
	}

	public void setiDemandStd(Double iDemandStd) {
		this.iDemandStd = iDemandStd;
	}

	public void setIlsts(Double ilsts) {
		this.ilsts = ilsts;
	}

	public void setRegulationStd(Long regulationStd) {
		this.regulationStd = regulationStd;
	}

	public void setRegulationStd_txt(String regulationStd_txt) {
		this.regulationStd_txt = regulationStd_txt;
	}

	public void setiDemand1(Double iDemand1) {
		this.iDemand1 = iDemand1;
	}

	public void setiActual1(Double iActual1) {
		this.iActual1 = iActual1;
	}

	public void setRegulation1(Long regulation1) {
		this.regulation1 = regulation1;
	}

	public void setRegulation1_txt(String regulation1_txt) {
		this.regulation1_txt = regulation1_txt;
	}

	public void setiDemand2(Double iDemand2) {
		this.iDemand2 = iDemand2;
	}

	public void setiActual2(Double iActual2) {
		this.iActual2 = iActual2;
	}

	public void setRegulation2(Long regulation2) {
		this.regulation2 = regulation2;
	}

	public void setRegulation2_txt(String regulation2_txt) {
		this.regulation2_txt = regulation2_txt;
	}

	public void setiDemand3(Double iDemand3) {
		this.iDemand3 = iDemand3;
	}

	public void setiActual3(Double iActual3) {
		this.iActual3 = iActual3;
	}

	public void setRegulation3(Long regulation3) {
		this.regulation3 = regulation3;
	}

	public void setRegulation3_txt(String regulation3_txt) {
		this.regulation3_txt = regulation3_txt;
	}

	public void setPhaStd(Double phaStd) {
		this.phaStd = phaStd;
	}

	public void setPha1(Double pha1) {
		this.pha1 = pha1;
	}

	public void setPha2(Double pha2) {
		this.pha2 = pha2;
	}

	public void setPha3(Double pha3) {
		this.pha3 = pha3;
	}

	public void setT_iDemandStd(Long t_iDemandStd) {
		this.t_iDemandStd = t_iDemandStd;
	}

	public void settActualStd(Long tActualStd) {
		this.tActualStd = tActualStd;
	}

	public void setPartIdentString(String partIdentString) {
		this.partIdentString = partIdentString;
	}

	public void setTipDressCounter(Long tipDressCounter) {
		this.tipDressCounter = tipDressCounter;
	}

	public void setElectrodeNo(Long electrodeNo) {
		this.electrodeNo = electrodeNo;
	}

	public void setVoltageActualValue(Double voltageActualValue) {
		this.voltageActualValue = voltageActualValue;
	}

	public void setVoltageRefValue(Double voltageRefValue) {
		this.voltageRefValue = voltageRefValue;
	}

	public void setCurrentActualValue(Double currentActualValue) {
		this.currentActualValue = currentActualValue;
	}

	public void setCurrentReferenceValue(Double currentReferenceValue) {
		this.currentReferenceValue = currentReferenceValue;
	}

	public void setWeldTimeActualValue(Double weldTimeActualValue) {
		this.weldTimeActualValue = weldTimeActualValue;
	}

	public void setWeldTimeRefValue(Double weldTimeRefValue) {
		this.weldTimeRefValue = weldTimeRefValue;
	}

	public void setEnergyActualValue(Double energyActualValue) {
		this.energyActualValue = energyActualValue;
	}

	public void setEnergyRefValue(Double energyRefValue) {
		this.energyRefValue = energyRefValue;
	}

	public void setPowerActualValue(Double powerActualValue) {
		this.powerActualValue = powerActualValue;
	}

	public void setPowerRefValue(Double powerRefValue) {
		this.powerRefValue = powerRefValue;
	}

	public void setResistanceActualValue(Double resistanceActualValue) {
		this.resistanceActualValue = resistanceActualValue;
	}

	public void setResistanceRefValue(Double resistanceRefValue) {
		this.resistanceRefValue = resistanceRefValue;
	}

	public void setPulseWidthActualValue(Double pulseWidthActualValue) {
		this.pulseWidthActualValue = pulseWidthActualValue;
	}

	public void setPulseWidthRefValue(Double pulseWidthRefValue) {
		this.pulseWidthRefValue = pulseWidthRefValue;
	}

	public void setStabilisationFactorActValue(Double stabilisationFactorActValue) {
		this.stabilisationFactorActValue = stabilisationFactorActValue;
	}

	public void setStabilisationFactorRefValue(Double stabilisationFactorRefValue) {
		this.stabilisationFactorRefValue = stabilisationFactorRefValue;
	}

	public void setThresholdStabilisationFactor(Double thresholdStabilisationFactor) {
		this.thresholdStabilisationFactor = thresholdStabilisationFactor;
	}

	public void setWldEffectStabilisationFactor(Double wldEffectStabilisationFactor) {
		this.wldEffectStabilisationFactor = wldEffectStabilisationFactor;
	}

	public void setUipActualValue(Double uipActualValue) {
		this.uipActualValue = uipActualValue;
	}

	public void setUipRefValue(Double uipRefValue) {
		this.uipRefValue = uipRefValue;
	}

	public void setUirExpulsionTime(Long uirExpulsionTime) {
		this.uirExpulsionTime = uirExpulsionTime;
	}

	public void setUirMeasuringActive(Long uirMeasuringActive) {
		this.uirMeasuringActive = uirMeasuringActive;
	}

	public void setUirMeasuringActive_txt(String uirMeasuringActive_txt) {
		this.uirMeasuringActive_txt = uirMeasuringActive_txt;
	}

	public void setUirRegulationActive(Long uirRegulationActive) {
		this.uirRegulationActive = uirRegulationActive;
	}

	public void setUirRegulationActive_txt(String uirRegulationActive_txt) {
		this.uirRegulationActive_txt = uirRegulationActive_txt;
	}

	public void setUirMonitoringActive(Long uirMonitoringActive) {
		this.uirMonitoringActive = uirMonitoringActive;
	}

	public void setUirMonitoringActive_txt(String uirMonitoringActive_txt) {
		this.uirMonitoringActive_txt = uirMonitoringActive_txt;
	}

	public void setUirWeldTimeProlongationActive(Long uirWeldTimeProlongationActive) {
		this.uirWeldTimeProlongationActive = uirWeldTimeProlongationActive;
	}

	public void setUirWeldTimeProlongActive_txt(String uirWeldTimeProlongActive_txt) {
		this.uirWeldTimeProlongActive_txt = uirWeldTimeProlongActive_txt;
	}

	public void setUirQStoppRefCntValue(Long uirQStoppRefCntValue) {
		this.uirQStoppRefCntValue = uirQStoppRefCntValue;
	}

	public void setUirQStoppActCntValue(Long uirQStoppActCntValue) {
		this.uirQStoppActCntValue = uirQStoppActCntValue;
	}

	public void setUirUipUpperTol(Long uirUipUpperTol) {
		this.uirUipUpperTol = uirUipUpperTol;
	}

	public void setUirUipLowerTol(Long uirUipLowerTol) {
		this.uirUipLowerTol = uirUipLowerTol;
	}

	public void setUirUipCondTol(Long uirUipCondTol) {
		this.uirUipCondTol = uirUipCondTol;
	}

	public void setUirPsfLowerTol(Long uirPsfLowerTol) {
		this.uirPsfLowerTol = uirPsfLowerTol;
	}

	public void setUirPsfCondTol(Long uirPsfCondTol) {
		this.uirPsfCondTol = uirPsfCondTol;
	}
}
