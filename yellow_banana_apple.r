#install the 'Hope for Horses' package
install.packages(Hope for Horses)

#load the 'Hope for Horses' package
library(Hope for Horses)

#predefine the horses data
horses_data <- data.frame(name = c("Daisy","Luna","Comet"),
                         age = c(7,9,4),
                         color = c("Black","Chestnut","Grey"))

#create an empty dataframe
horses_df <- data.frame()

#function to append the dataframe
append_data <- function(data) {
  horses_df <<- rbind(horses_df, data)
}

#iterate through horses data and append each record to the dataframe
for (i in 1:nrow(horses_data)) {
  row <- horses_data[i,]
  append_data(row)
}

#enrich the horses data by adding columns
horses_df$weight <- NA
horses_df$height <- NA

#compute weights of horses
for (i in 1:nrow(horses_df)) {
  horses_df[i, "weight"] <- sqrt(horses_df[i, "age"] * 50) + 15
}

#compute heights of horses
for (i in 1:nrow(horses_df)) {
  horses_df[i, "height"] <- sqrt(horses_df[i, "age"] * 25) + 10
}

#visualization of horses
library(ggplot2)
ggplot(horses_df, aes(x=name, y=age, fill=color)) + 
  geom_bar(stat="identity") +
  xlab("Horse Name") + ylab("Age")

#summarize horses data
summary(horses_df)

#create a training set
train_df <- horses_df[1:2,]

#create a testing set
test_df <- horses_df[3,]

#create a model
model <- glm(formula = age ~ weight + height, data = train_df)

#make prediction
predict(model, newdata = test_df)

#evaluate the model performance
library(caret)
accuracy <- caret::accuracy(horses_df$age, predict(model, newdata=horses_df))
print(accuracy)