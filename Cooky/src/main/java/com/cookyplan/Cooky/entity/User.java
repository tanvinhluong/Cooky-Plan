package com.cookyplan.Cooky.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer Id;
//	String userName;
	String Ho;
	String Ten;
	String Phai;
	String diaChi;
	String soDT;
	String Email;
	Date ngayTao;

	@OneToOne
	@JoinColumn(name="USERNAME")
	Account account;
	
//	@OneToOne(mappedBy="user")
//	Favorite favorite;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getHo() {
		return Ho;
	}

	public void setHo(String ho) {
		Ho = ho;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public String getPhai() {
		return Phai;
	}

	public void setPhai(String phai) {
		Phai = phai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

//	public Favorite getFavorite() {
//		return favorite;
//	}
//
//	public void setFavorite(Favorite favorite) {
//		this.favorite = favorite;
//	}
//	
	
	
}
