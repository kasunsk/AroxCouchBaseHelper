package com.isa.arox.api.auxiliary.dto;

import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */

@SuppressWarnings("serial")
public class Agent implements Serializable {

    private String agentCode;
    private String name;


    public String getAgentCode() {

        return agentCode;
    }


    public void setAgentCode(String agentCode) {

        this.agentCode = agentCode;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Agent agent = (Agent) o;

        if (agentCode != null ? !agentCode.equals(agent.agentCode) : agent.agentCode != null) {
            return false;
        }
        if (name != null ? !name.equals(agent.name) : agent.name != null) {
            return false;
        }

        return true;
    }


    @Override
    public int hashCode() {

        int result = agentCode != null ? agentCode.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
