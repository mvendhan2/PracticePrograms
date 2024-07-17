package javaprogram.src.NewJAVACodes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Group {
    private String title;
    private int id;
    private boolean active;
    private ParentGroup parentGroup;
    private List<Manager> managers;
    private List<Agent> agents;

    // Nested static class for ParentGroup
    public static class ParentGroup {
        private int id;
        private String title;

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    // Nested static class for Manager (if needed)
    public static class Manager {
        // Assuming managers have more fields, otherwise, this can be removed or kept as an empty class
    }

    // Nested static class for Agent
    public static class Agent {
        private int id;
        private String title;

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        // Method to print agent's details
        public void printDetails() {
            System.out.println("Agent ID: " + id + ", Title: " + title);
        }

        // Method to convert agent's details to JSON and return
        public String getDetailsAsJson() {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                return objectMapper.writeValueAsString(this);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public ParentGroup getParentGroup() {
        return parentGroup;
    }

    public void setParentGroup(ParentGroup parentGroup) {
        this.parentGroup = parentGroup;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }
}
