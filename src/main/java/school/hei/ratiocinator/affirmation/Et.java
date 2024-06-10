package school.hei.ratiocinator.affirmation;

import static school.hei.ratiocinator.affirmation.ValeurDeVerite.faux;
import static school.hei.ratiocinator.affirmation.ValeurDeVerite.jenesaispas;

public final class Et extends AffirmationComposee {
  public Et(Affirmation affirmation1, Affirmation affirmation2) {
    super(affirmation1, "et", affirmation2);
  }

  @Override
  public ValeurDeVerite valeurDeVerite() {
    var valeur2 = affirmation2.valeurDeVerite();
    return switch (affirmation1.valeurDeVerite()) {
      case vrai -> valeur2;
      case faux -> faux;
      case jenesaispas -> faux.equals(valeur2) ? faux : jenesaispas;
    };
  }
}
