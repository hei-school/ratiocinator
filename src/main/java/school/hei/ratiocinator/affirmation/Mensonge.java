package school.hei.ratiocinator.affirmation;

import static school.hei.ratiocinator.affirmation.ValeurDeVerite.faux;

public final class Mensonge extends Affirmation {
  public Mensonge(String phrase) {
    super(phrase);
  }

  @Override
  public ValeurDeVerite valeurDeVerite() {
    return faux;
  }
}
