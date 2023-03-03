package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilitySyncStateInfo.*;
import org.sorapointa.proto.AbilitySyncStateInfo;
import org.sorapointa.proto.AnimatorParameterValueInfoPair.*;
import org.sorapointa.proto.AnimatorParameterValueInfoPair;
import org.sorapointa.proto.EntityClientExtraInfo.*;
import org.sorapointa.proto.EntityClientExtraInfo;
import org.sorapointa.proto.EntityRendererChangedInfo.*;
import org.sorapointa.proto.EntityRendererChangedInfo;
import org.sorapointa.proto.SceneEntityAiInfo.*;
import org.sorapointa.proto.SceneEntityAiInfo;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EntityAuthorityInfo {
    @Tag(tag=1) public AbilitySyncStateInfo abilityInfo = null;
    @Tag(tag=2) public EntityRendererChangedInfo rendererChangedInfo = null;
    @Tag(tag=3) public SceneEntityAiInfo aiInfo = null;
    @Tag(tag=4) public Vector bornPos = null;
    @Tag(tag=5) public List<AnimatorParameterValueInfoPair> poseParaList = new ArrayList<>();
    @Tag(tag=6) public EntityClientExtraInfo clientExtraInfo = null;
}
