package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityActionBlink {
    @Tag(tag=11) public Vector rot = null;
    @Tag(tag=10) public Vector pos = null;
}
