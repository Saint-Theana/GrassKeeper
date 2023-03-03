package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeTransferReq {
    @Tag(tag=1) public Integer guid = null;
    @Tag(tag=12) public Boolean isTransferToSafePoint = null;
}
