package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtAvatarLockChairRsp {
    @Tag(tag=14) public Long chairId = null;
    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=4) public Vector position = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
