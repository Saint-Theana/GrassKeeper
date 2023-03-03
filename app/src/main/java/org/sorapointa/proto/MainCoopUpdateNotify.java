package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MainCoop.*;
import org.sorapointa.proto.MainCoop;

public class MainCoopUpdateNotify {
    @Tag(tag=5) public List<MainCoop> mainCoopList = new ArrayList<>();
}
