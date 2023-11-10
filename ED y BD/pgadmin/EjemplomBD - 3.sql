SELECT *
FROM demografia_basica;

SELECT *,
		(hombres::numeric / (hombres+mujeres)),
		(mujeres::numeric /(hombres+mujeres))
FROM demografia_basica;