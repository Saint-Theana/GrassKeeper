package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FinishLanternProjectionReq {
    @Tag(tag=3) public Integer finishTime = null;
    @Tag(tag=11) public Integer levelId = null;
}
