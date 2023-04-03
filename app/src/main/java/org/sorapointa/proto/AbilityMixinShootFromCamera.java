package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityMixinShootFromCamera {
    @Tag(tag=6) public Vector initPos = null;
    @Tag(tag=9) public Vector forward = null;
}
