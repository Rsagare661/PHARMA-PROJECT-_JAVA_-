package com.example.pharma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
public class DoctorData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long doctorId;
	private String doctorName;
	private String doctorHospitalAddress;
	private String doctorContact;

	public DoctorData() {
	}

	public DoctorData(Long doctorId, String doctorName, String doctorHospitalAddress, String doctorContact) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorHospitalAddress = doctorHospitalAddress;
		this.doctorContact = doctorContact;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorHospitalAddress() {
		return doctorHospitalAddress;
	}

	public void setDoctorHospitalAddress(String doctorHospitalAddress) {
		this.doctorHospitalAddress = doctorHospitalAddress;
	}

	public String getDoctorContact() {
		return doctorContact;
	}

	public void setDoctorContact(String doctorContact) {
		this.doctorContact = doctorContact;
	}

	@Override
	public String toString() {
		return "DoctorData [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorHospitalAddress="
				+ doctorHospitalAddress + ", doctorContact=" + doctorContact + "]";
	}
}
