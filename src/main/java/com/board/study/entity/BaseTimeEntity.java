package com.board.study.entity;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
// JPA Entity 클래스들이 BaseTimeEntity를 상속할 경우 필드들(createdDate, modifiedDate)도 칼럼으로 인식하도록 합니다.
@MappedSuperclass
// BaseEntity 클래스에 Auditing 기능을 포함시킵니다.
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
	
	// Entity가 생성되어 저장될 때 시간이 자동 저장된다.
	@CreatedDate
	private LocalDateTime registerTime;
	
	// 조회한 Entity의 값을 변경할 때 시간이 자동 저장된다.
	@LastModifiedDate
	private LocalDateTime	updateTime;
}