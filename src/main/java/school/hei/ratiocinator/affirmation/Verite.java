package school.hei.ratiocinator.affirmation;

import static school.hei.ratiocinator.affirmation.ValeurDeVerite.vrai;

public final class Verite extends Affirmation {
  public Verite(String phrase) {
    super(phrase);
  }

  @Override
  public ValeurDeVerite valeurDeVerite() {
    return vrai;
  }
}
