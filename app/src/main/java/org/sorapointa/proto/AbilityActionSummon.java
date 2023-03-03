package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityActionSummon {
    @Tag(tag=10) public Vector pos = null;
    @Tag(tag=1) public Vector rot = null;
}
