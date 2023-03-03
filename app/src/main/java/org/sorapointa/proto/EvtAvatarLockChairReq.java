package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtAvatarLockChairReq {
    @Tag(tag=5) public Long chairId = null;
    @Tag(tag=8) public Vector position = null;
}
