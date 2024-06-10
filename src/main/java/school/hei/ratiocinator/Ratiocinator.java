package school.hei.ratiocinator;

import school.hei.ratiocinator.affirmation.Affirmation;
import school.hei.ratiocinator.affirmation.ValeurDeVerite;

import java.util.function.Function;

public class Ratiocinator // Ne sert à rien tel quel, car simple indirection. Permet juste d'expliciter la notion.
    implements Function<Affirmation, ValeurDeVerite> {
  @Override
  public ValeurDeVerite apply(Affirmation affirmation) {
    return affirmation.valeurDeVerite();
  }
}
