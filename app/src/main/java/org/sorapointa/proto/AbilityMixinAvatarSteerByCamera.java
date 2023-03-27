package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinAvatarSteerByCamera {
    @Tag(tag=2) public Vector targetDir = null;
    @Tag(tag=4) public Vector targetPos = null;
}
