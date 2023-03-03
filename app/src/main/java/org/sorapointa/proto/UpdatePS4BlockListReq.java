package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePS4BlockListReq {
    @Tag(tag=10) public List<String> psnIdList = new ArrayList<>();
}
