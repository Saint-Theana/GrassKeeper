package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetOpenStateReq {
    @Tag(tag=12) public Integer key = null;
    @Tag(tag=5) public Integer value = null;
}
