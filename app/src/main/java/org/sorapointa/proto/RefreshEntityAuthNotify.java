package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RefreshEntityAuthNotify {
    @Tag(tag=7) public List<Integer> entityIdList = new ArrayList<>();
}
