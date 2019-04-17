package com.irsspace.irs;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("irsSolution")
@org.optaplanner.core.api.domain.solution.PlanningSolution(autoDiscoverMemberType = org.optaplanner.core.api.domain.autodiscover.AutoDiscoverMemberType.FIELD)
@javax.xml.bind.annotation.XmlRootElement
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class irsSolution implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Location List")
	private java.util.List<com.irsspace.irs.irsLocation> locationList;
	@org.kie.api.definition.type.Label("Vehicle List")
	@org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "vehicleRange")
	private java.util.List<com.irsspace.irs.irsVehicle> vehicleList;
	@org.kie.api.definition.type.Label("Student List")
	@org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "studentRange")
	private java.util.List<com.irsspace.irs.irsStudent> studentList;

	@javax.annotation.Generated({"org.optaplanner.workbench.screens.domaineditor.client.widgets.planner.PlannerDataObjectEditor"})
	@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(org.optaplanner.persistence.jaxb.api.score.buildin.hardsoft.HardSoftScoreJaxbXmlAdapter.class)
	@org.kie.api.definition.type.Label("Generated Planner score field")
	@org.optaplanner.core.api.domain.solution.PlanningScore
	private org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score;

	public irsSolution() {
	}

	public java.util.List<com.irsspace.irs.irsLocation> getLocationList() {
		return this.locationList;
	}

	public void setLocationList(
			java.util.List<com.irsspace.irs.irsLocation> locationList) {
		this.locationList = locationList;
	}

	public java.util.List<com.irsspace.irs.irsVehicle> getVehicleList() {
		return this.vehicleList;
	}

	public void setVehicleList(
			java.util.List<com.irsspace.irs.irsVehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public java.util.List<com.irsspace.irs.irsStudent> getStudentList() {
		return this.studentList;
	}

	public void setStudentList(
			java.util.List<com.irsspace.irs.irsStudent> studentList) {
		this.studentList = studentList;
	}

	public org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore getScore() {
		return this.score;
	}

	public void setScore(
			org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score) {
		this.score = score;
	}

	public irsSolution(
			java.util.List<com.irsspace.irs.irsLocation> locationList,
			java.util.List<com.irsspace.irs.irsVehicle> vehicleList,
			java.util.List<com.irsspace.irs.irsStudent> studentList,
			org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score) {
		this.locationList = locationList;
		this.vehicleList = vehicleList;
		this.studentList = studentList;
		this.score = score;
	}

}