package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneEntityInfo {
    @Tag(tag=1) public Integer entityType = null;
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=3) public String name = null;
    @Tag(tag=4) public MotionInfo motionInfo = null;
    @Tag(tag=5) public List<PropPair> propList = new ArrayList<>();
    @Tag(tag=6) public List<FightPropPair> fightPropList = new ArrayList<>();
    @Tag(tag=7) public Integer lifeState = null;
    @Tag(tag=9) public List<AnimatorParameterValueInfoPair> animatorParaList = new ArrayList<>();
    @Tag(tag=10) public Avatar avatar = null;
    @Tag(tag=11) public Monster monster = null;
    @Tag(tag=12) public Npc npc = null;
    @Tag(tag=13) public Gadget gadget = null;
    @Tag(tag=17) public Integer lastMoveSceneTimeMs = null;
    @Tag(tag=18) public Integer lastMoveReliableSeq = null;
    @Tag(tag=19) public EntityClientData entityClientData = null;
    @Tag(tag=20) public List<EntityEnvironmentInfo> entityEnvironmentInfoList = new ArrayList<>();
    @Tag(tag=21) public EntityAuthorityInfo entityAuthorityInfo = null;
    @Tag(tag=22) public List<String> tagList = new ArrayList<>();
    @Tag(tag=23) public List<ServerBuff> serverBuffList = new ArrayList<>();
}
