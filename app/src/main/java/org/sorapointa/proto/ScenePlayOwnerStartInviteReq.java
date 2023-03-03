package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayOwnerStartInviteReq {
    @Tag(tag=8) public Boolean isSkipMatch = null;
    @Tag(tag=13) public Integer playId = null;
}
