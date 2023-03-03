package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectWorktopOptionReq {
    @Tag(tag=12) public Integer gadgetEntityId = null;
    @Tag(tag=11) public Integer optionId = null;
}
