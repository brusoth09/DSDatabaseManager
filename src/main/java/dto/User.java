package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * model class of user entity.
 *
 */
@Entity
public class User {
    private @Id @GeneratedValue int id;
}
