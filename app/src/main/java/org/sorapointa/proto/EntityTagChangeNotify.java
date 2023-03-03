package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityTagChangeNotify {
    @Tag(tag=2) public String tag = null;
    @Tag(tag=8) public Integer entityId = null;
    @Tag(tag=10) public Boolean isAdd = null;
}
