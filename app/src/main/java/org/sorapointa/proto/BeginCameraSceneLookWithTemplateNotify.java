package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class BeginCameraSceneLookWithTemplateNotify {
    public enum FollowType {
        @Tag(tag=0) FOLLOW_TYPE_INIT_FOLLOW_POS ,
        @Tag(tag=1) FOLLOW_TYPE_SET_FOLLOW_POS ,
        @Tag(tag=2) FOLLOW_TYPE_SET_ABS_FOLLOW_POS ;
    }

    @Tag(tag=8) public Vector lookPos = null;
    @Tag(tag=5) public Integer templateId = null;
    @Tag(tag=2) public Vector followPos = null;
    @Tag(tag=12) public Integer entityId = null;
    @Tag(tag=13) public List<String> otherParams = new ArrayList<>();
    @Tag(tag=9) public FollowType followType = null;
}
