package school.hei.ratiocinator.affirmation;

import lombok.AllArgsConstructor;

import static school.hei.ratiocinator.affirmation.ValeurDeVerite.jenesaispas;

@AllArgsConstructor
public sealed class Affirmation permits Mensonge, Verite, AffirmationComposee {

  protected final String phrase;

  public ValeurDeVerite valeurDeVerite() {
    return jenesaispas;
  }

  public final Affirmation et(Affirmation autreAffirmation) {
    return new Et(this, autreAffirmation);
  }

  public final Affirmation ou(Affirmation autreAffirmation) {
    return new Ou(this, autreAffirmation);
  }

  public final Affirmation donc(Affirmation autreAffirmation) {
    return new Donc(this, autreAffirmation);
  }
}
