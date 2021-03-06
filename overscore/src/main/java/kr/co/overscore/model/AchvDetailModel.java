package kr.co.overscore.model;

import kr.co.overscore.service.CacheService;

public class AchvDetailModel implements IMetaModel {
	String achvId;
	String achvDetailId;
	String achvDetailName;
	String achvDetailEng;
	String achvDetailKor;

	public String getAchvId() {
		return achvId;
	}

	public void setAchvId(String achvId) {
		this.achvId = achvId;
	}

	public String getAchvDetailId() {
		return achvDetailId;
	}

	public String getAchvDetailName() {
		return achvDetailName;
	}

	public void setAchvDetailName(String achvDetailName) {
		this.achvDetailName = achvDetailName;
	}

	public void setAchvDetailId(String achvDetailId) {
		this.achvDetailId = achvDetailId;
	}

	public String getAchvDetailEng() {
		return achvDetailEng;
	}

	public void setAchvDetailEng(String achvDetailEng) {
		this.achvDetailEng = achvDetailEng;
	}

	public String getAchvDetailKor() {
		return achvDetailKor;
	}

	public void setAchvDetailKor(String achvDetailKor) {
		this.achvDetailKor = achvDetailKor;
	}

	@Override
	public String getMetaId() {
		return getAchvDetailId();
	}

	@Override
	public String getMetaKey() {
		return getAchvDetailName();
	}
}
