package com.ananotherrpg.level;

import java.util.List;

import com.ananotherrpg.Identifiable;

public class Quest implements Identifiable {
	private int questId;

	private String questName;
	private List<Objective> objectives;

	private boolean isComplete;

	public Quest(int questId, String questName, List<Objective> objectives, boolean isComplete) {
		super();
		this.questId = questId;
		this.objectives = objectives;
		this.isComplete = isComplete;
		this.questName = questName;
	}

	public Quest(int questId, List<Objective> objectives, boolean isComplete, boolean isActive) {
		super();
		this.questId = questId;
		this.objectives = objectives;
		this.isComplete = isComplete;

	}

	public int getId() {
		return questId;
	}

	public String getQuestName() {
		return questName;
	}

	@Override
	public String getName() {
		return questName;
	}

	public List<Objective> getObjectives() {
		return objectives;
	}
}
