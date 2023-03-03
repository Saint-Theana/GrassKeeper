package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Route.*;
import org.sorapointa.proto.Route;

public class AvatarFollowRouteNotify {
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=6) public Integer templateId = null;
    @Tag(tag=8) public Integer startSceneTimeMs = null;
    @Tag(tag=2) public Route route = null;
    @Tag(tag=13) public String clientParams = null;
}
