package school.hei.ratiocinator.affirmation;

import static school.hei.ratiocinator.affirmation.ValeurDeVerite.jenesaispas;
import static school.hei.ratiocinator.affirmation.ValeurDeVerite.vrai;

public final class Ou extends AffirmationComposee {
  public Ou(Affirmation affirmation1, Affirmation affirmation2) {
    super(affirmation1, "ou", affirmation2);
  }

  @Override
  public ValeurDeVerite valeurDeVerite() {
    var valeur2 = affirmation2.valeurDeVerite();
    return switch (affirmation1.valeurDeVerite()) {
      case vrai -> vrai;
      case faux -> valeur2;
      case jenesaispas -> vrai.equals(valeur2) ? vrai : jenesaispas;
    };
  }
}
