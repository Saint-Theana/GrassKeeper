package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AddQuestContentProgressReq {
    @Tag(tag=6) public Integer contentType = null;
    @Tag(tag=12) public Integer param = null;
    @Tag(tag=15) public Integer addProgress = null;
}
