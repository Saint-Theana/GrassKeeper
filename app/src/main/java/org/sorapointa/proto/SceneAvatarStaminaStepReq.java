package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class SceneAvatarStaminaStepReq {
    @Tag(tag=15) public Boolean useClientRot = null;
    @Tag(tag=7) public Vector rot = null;
}
