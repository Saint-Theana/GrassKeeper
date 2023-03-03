package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockTransPointReq {
    @Tag(tag=12) public Integer pointId = null;
    @Tag(tag=10) public Integer sceneId = null;
}
