package school.hei.ratiocinator;

import org.junit.jupiter.api.Test;
import school.hei.ratiocinator.affirmation.Affirmation;
import school.hei.ratiocinator.affirmation.Mensonge;
import school.hei.ratiocinator.affirmation.Verite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static school.hei.ratiocinator.affirmation.ValeurDeVerite.faux;
import static school.hei.ratiocinator.affirmation.ValeurDeVerite.vrai;

class RatiocinatorTest {

  private final Ratiocinator ratiocinator = new Ratiocinator();

  @Test
  void lou_est_beau() {
    var lou_est_beau = new Verite("Lou est beau");
    assertEquals(vrai, ratiocinator.apply(lou_est_beau));
  }

  @Test
  void lou_est_pauvre() {
    var lou_est_pauvre = new Mensonge("Lou est pauvre");
    assertEquals(faux, ratiocinator.apply(lou_est_pauvre));
  }

  @Test
  void lou_est_beau_et_pauvre() {
    var lou_est_beau = new Verite("Lou est beau");
    var lou_est_pauvre = new Mensonge("Lou est pauvre");
    assertEquals(faux, ratiocinator.apply(lou_est_beau.et(lou_est_pauvre)));
  }

  @Test
  void lou_est_beau_ou_pauvre() {
    var lou_est_beau = new Verite("Lou est beau");
    var lou_est_pauvre = new Mensonge("Lou est pauvre");
    assertEquals(vrai, ratiocinator.apply(lou_est_beau.ou(lou_est_pauvre)));
  }

  @Test
  void une_affirmation_complexe() {
    var lou_est_beau = new Verite("Lou est beau");
    var lou_est_pauvre = new Mensonge("Lou est pauvre");
    var lou_est_genereux = new Affirmation("Lou est généreux");
    assertEquals(faux, ratiocinator.apply((lou_est_beau.ou(lou_est_genereux)).donc(lou_est_pauvre)));
  }
}