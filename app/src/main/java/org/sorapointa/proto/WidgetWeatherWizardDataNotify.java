package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetWeatherWizardDataNotify {
    public enum HLAPCNOKIHB {
        @Tag(tag=0) None ,
        @Tag(tag=5947) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer shieldValue = null;
}
