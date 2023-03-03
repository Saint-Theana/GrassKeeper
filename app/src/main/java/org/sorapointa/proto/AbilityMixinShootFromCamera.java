package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityMixinShootFromCamera {
    @Tag(tag=13) public Vector initPos = null;
    @Tag(tag=2) public Vector forward = null;
}
