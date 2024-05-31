package expeditors.backend.week12.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Table(name = "pet")
@Entity(name = "Pet")
public class Pet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;

    @Enumerated(EnumType.STRING)
    private PetType type;
    private String breed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="adopter_id", nullable = true)
    @JsonIgnoreProperties("pets")
    private Adopter adopter;


    public Pet(PetType type, String name, String breed) {
        this.type = type;
        this.name = name;
        this.breed = breed;
    }

    public int getPetId() {
        return Id;
    }

    public void setPetId(int petId) {
        this.Id = petId;
    }

    public Pet(PetType type) {
        this(type, null, null);
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", breed='" + breed + '\'' +
                '}';
    }

    public static PetBuilder builder(PetType type) {
        return new PetBuilder().type(type);
    }

    public static class PetBuilder {
        private int Id;
        private PetType type;
        private String name;
        private String breed;

        public PetBuilder petId(int id) {
            this.Id = id;
            return this;
        }
        public PetBuilder type(PetType type) {
            this.type = type;
            return this;
        }
        public PetBuilder name(String name) {
            this.name = name;
            return this;
        }
        public PetBuilder breed(String breed) {
            this.breed = breed;
            return this;
        }

        public Pet build() {
            if(this.type == null) {
                throw new RuntimeException("A type is REQUIRED");
            }
            return new Pet(type, name, breed);
        }
    }
}
