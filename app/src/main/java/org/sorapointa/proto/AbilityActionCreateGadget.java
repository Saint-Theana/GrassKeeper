package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityActionCreateGadget {
    @Tag(tag=9) public Integer roomId = null;
    @Tag(tag=2) public Vector rot = null;
    @Tag(tag=15) public Vector pos = null;
}
