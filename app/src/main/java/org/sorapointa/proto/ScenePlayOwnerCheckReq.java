package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayOwnerCheckReq {
    @Tag(tag=9) public Integer playId = null;
    @Tag(tag=6) public Boolean isSkipMatch = null;
}
