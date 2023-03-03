package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgCharDie {
    @Tag(tag=5) public Integer controllerId = null;
    @Tag(tag=11) public Integer cardGuid = null;
}
