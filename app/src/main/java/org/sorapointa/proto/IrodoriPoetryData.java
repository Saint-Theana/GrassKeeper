package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriPoetryThemeData.*;
import org.sorapointa.proto.IrodoriPoetryThemeData;

public class IrodoriPoetryData {
    @Tag(tag=10) public List<IrodoriPoetryThemeData> themeDataList = new ArrayList<>();
    @Tag(tag=2) public Integer curThemeId = null;
}
