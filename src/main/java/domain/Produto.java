package domain;

public class Produto {

	public Produto(Integer id, String nome){
		this.id = id;
		this.name = nome;
	}
	
	private Integer id;
	
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
