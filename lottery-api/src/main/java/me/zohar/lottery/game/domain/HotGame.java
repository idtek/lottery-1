package me.zohar.lottery.game.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "v_hot_game", schema = "lottery")
@DynamicInsert(true)
@DynamicUpdate(true)
public class HotGame {
	
	/**
	 * 主键id
	 */
	@Id
	@Column(name = "id", length = 32)
	private String id;

	/**
	 * 游戏代码
	 */
	private String gameCode;

	/**
	 * 游戏名称
	 */
	private String gameName;
	
	/**
	 * 总期数
	 */
	private Long issueCount;
	
	/**
	 * 当前期
	 */
	private Long currentIssue;
	
	private Long currentIssueInner;

}
