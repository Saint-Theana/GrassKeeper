package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterScenePeerNotify {
    @Tag(tag=12) public Integer destSceneId = null;
    @Tag(tag=11) public Integer enterSceneToken = null;
    @Tag(tag=14) public Integer hostPeerId = null;
    @Tag(tag=1) public Integer peerId = null;
}
