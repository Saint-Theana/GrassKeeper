package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class SceneAvatarStaminaStepRsp {
    @Tag(tag=9) public Boolean useClientRot = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Vector rot = null;
}
