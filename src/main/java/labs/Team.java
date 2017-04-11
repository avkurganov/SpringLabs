package labs;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import labs.controller.Player;

@Entity
public class Team {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String location;

	private String mascotte;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamId")
	private Set<Player> player;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMascotte() {
		return mascotte;
	}

	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}

	public Set<Player> getPlayer() {
		return player;
	}

	public void setPlayer(Set<Player> player) {
		this.player = player;
	}

	public Team() {

	}

	public Team(String name, String location, Set<Player> player) {
		this.name = name;
		this.location = location;
		this.player = player;
	}

}
