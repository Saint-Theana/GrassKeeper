package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityMixinAvatarSteerByCamera {
    @Tag(tag=7) public Vector targetDir = null;
    @Tag(tag=6) public Vector targetPos = null;
}
