package school.hei.ratiocinator.affirmation;

import static school.hei.ratiocinator.affirmation.ValeurDeVerite.faux;
import static school.hei.ratiocinator.affirmation.ValeurDeVerite.jenesaispas;
import static school.hei.ratiocinator.affirmation.ValeurDeVerite.vrai;

public final class Donc extends AffirmationComposee {
  public Donc(Affirmation affirmation1, Affirmation affirmation2) {
    super(affirmation1, "donc", affirmation2);
  }

  @Override
  public ValeurDeVerite valeurDeVerite() {
    return switch (affirmation1.valeurDeVerite()) {
      case faux -> vrai;
      case vrai -> switch (affirmation2.valeurDeVerite()) {
        case vrai -> vrai;
        case faux -> faux;
        case jenesaispas -> jenesaispas;
      };
      case jenesaispas -> jenesaispas;
    };
  }
}
